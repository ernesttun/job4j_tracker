package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class PassportOfficeTest {
    @Test
    public void whenTestAddMethod() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport())).isEqualTo(citizen);
    }

    @Test
    public void whenTestFalseAddMethod() {
        Citizen citizen = new Citizen("qq56", "Ernest");
        Citizen cit = new Citizen("qq56", "Maks");
        PassportOffice passportOffice = new PassportOffice();
        passportOffice.add(citizen);
        assertThat(passportOffice.add(cit)).isFalse();
    }
}