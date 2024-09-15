package assignment_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Account {
    private int balance;
    private String accountID;
    private Person accountHolder;

    public Account(String id, int balance, Person person) {
        this.accountID = id;
        this.balance = balance;
        this.accountHolder = person;
    }

    protected void depositAmount(int amount) {
        balance += amount;
    }

    protected int withdrawAmount(int amount) {
        balance -= amount;
        return amount;
    }

    public int getBalance() {
        return balance;
    }

    public boolean isAccountId(String id) {
        return this.accountID.equals(id);
    }

    public boolean isAccountHolder(Person person) {
        return accountHolder == person;
    }
}

class Bank {
    private String name;
    private List<Account> accounts;
    public static final int MAX_WITHDRAW = 500;

    private final int MIN_INITIAL_DEPOSIT = 150;

    public Bank(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    public boolean withdrawAmount(int amount, Person person) {
        if(getAccountByPerson(person).getBalance() - amount <= -MAX_WITHDRAW) {
            System.out.println("Cannot withdraw over the limit!");
            return false;
        }

        getAccountByPerson(person).withdrawAmount(amount);
        return true;
    }

    public boolean openBankAccount(Person person, int initialDeposit) {
        boolean bankOpened = canBankAccount(person, initialDeposit);

        if(bankOpened) {
            accounts.add(new Account(getRandomId(), initialDeposit, person));
        }

        return bankOpened;
    }

    public Account getAccountByPerson(Person person) {
        for (Account account : accounts) {
            if(account.isAccountHolder(person)) {
                return account;
            }
        }

        return null;
    }

    private String getRandomId() {
        int id =  new Random().nextInt(4124124);
        return this.name.charAt(0) + ":" + id;
    }

    private boolean canBankAccount(Person person, int initialDeposit) {
        boolean bankOpened = false;
        if(!person.isOlderThan(16)) {
            System.out.println(person.getFullName() + " is not old enough to open a Bank Account!");
        } else {
            bankOpened = true;
        }

        if(initialDeposit < MIN_INITIAL_DEPOSIT) {
            System.out.println("The Deposit of " + initialDeposit + " is not enough. Need at least " + MIN_INITIAL_DEPOSIT);
        } else {
            bankOpened = true;
        }


        return bankOpened;
    }
}

class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;

    public Person(String firstName, String middleName, String lastName, int age) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isOlderThan(int olderThan) {
        return age >= olderThan;
    }

    public Person(String firstName, String lastName, int age) {
        this(firstName, "", lastName, age);
    }
}

public class Main {
    public static void main(String[] args) {
        Person nano = new Person("Nano", "Attack", 8);
        Person daniel = new Person("Daniel", "Smith", 24);
        Person marie = new Person("Marie", "Susan", "Jones", 28);

        Bank kb = new Bank("KaupenBank");
        kb.openBankAccount(nano, 200); // Not old Enough

        kb.openBankAccount(marie, 2000);
        kb.openBankAccount(daniel, 10); // Deposit is not enough

        System.out.println(kb.getAccountByPerson(marie).getBalance()); // 2000
        kb.withdrawAmount(3000, marie); // Cannot withdraw over the limit!
    }
}