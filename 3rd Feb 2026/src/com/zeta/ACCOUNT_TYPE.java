package com.zeta;

public enum ACCOUNT_TYPE {
    savings, salary, current;

    public static class Account {
        float balance;

        public float getBalance() {
            return balance;
        }

        public void setBalance(float balance) {
            this.balance = balance;
        }

        public int getNumber() {
            return number;
        }

        public ACCOUNT_TYPE getType() {
            return type;
        }

        public void setType(ACCOUNT_TYPE type) {
            this.type = type;
        }

        private final int number;
        ACCOUNT_TYPE type;
        public Account(int number) {
            this.number = number;
        }
    }
}
