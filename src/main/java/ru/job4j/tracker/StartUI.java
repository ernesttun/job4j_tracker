package ru.job4j.tracker;

import ru.job4j.tracker.action.*;

import java.util.Arrays;
import java.util.List;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.size()) {
                out.println("Wrong input, you can select: 0 .. " + (actions.size() - 1));
                continue;
            }
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(List<UserAction> actions) {
        out.println("Menu:");
        for (int index = 0; index < actions.size(); index++) {
            out.println(index + ". " + actions.get(index).name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new Console());
        Tracker tracker = new Tracker();
        UserAction[] action = {new Create(output), new ShowAll(output),
                new Edit(output), new Delete(output), new FindItemsById(output),
                new FindItemsByName(output), new ExitProgram(output)};
        List<UserAction> actions = Arrays.asList(action);
        new StartUI(output).init(input, tracker, actions);
    }
}
