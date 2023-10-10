package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    /**
     * Хранение всех пользователей системы с привязанными к ним счетами
     * осуществляется в коллекции типа HashMap
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход пользователя и добавляет пользователя в систему
     * К user добавить пустой список new ArrayList<Account>()
     * Если пользователь уже существует, то добавлять его не надо
     *
     * @param user пользователь
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод принимает на вход паспорт пользователя и удаляет самого пользователя
     * Удаление пользователя по ключу, т.е через его паспорт
     *
     * @param passport паспорт пользователя
     */
    public void deleteUser(String passport) {
        users.remove(new User(passport, ""));
    }

    /**
     * Метод принимает на вход паспорт и счет пользователя и добавляет новый счет к пользователю
     * Пользователя находим по паспорту с помощью метода findByPassport
     * Если такого счета у пользователя нет, то добавляем его
     *
     * @param passport паспорт пользователя
     * @param account  счет пользователя
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = getAccounts(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод принимает на вход паспорт пользователя и с помощью него находит пользователя
     *
     * @param passport паспорт пользователя
     * @return пользователь или null
     */
    public User findByPassport(String passport) {
        User user = null;
        for (User itr : users.keySet()) {
            if (itr.getPassport().equals(passport)) {
                user = itr;
                break;
            }
        }
        return user;
    }

    /**
     * Метод выполняет поиск аккаунта в базе данных
     * по заданному паспортному номеру и реквезитам
     * Возращает найденный счет ил null, если счет не найден
     *
     * @param passport  паспорт пользователя
     * @param requisite реквезиты счета
     * @return найденный счет или null, если счет не найден
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        Account rsl = null;
        List<Account> accounts = getAccounts(user);
        if (user != null) {
            for (Account account : accounts) {
                if (account.getRequisite().equals(requisite)) {
                    rsl = account;
                    break;
                }
            }
        }
        return rsl;
    }

    /**
     * Метод выполняет перевод заданной суммы денежных средств с одного счета на другой.
     * Возвращает true, если перевод прошел успешно, иначе возвращает false.
     *
     * @param srcPassport   - паспортный номер исходного счета
     * @param srcRequisite  - реквизиты исходного счета
     * @param destPassport  - паспортный номер счета получателя
     * @param destRequisite - реквизиты счета получателя
     * @param amount        - сумма перевода
     * @return true, если перевод прошел успешно, если нет, то false
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null
                && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
