package com.kobwid;

public class UserDummy {
    private User[] users;

    public UserDummy() {
        this.users = new User[]{
            new User("kobulwidodo", "38123",111111, 10000),
            new User("mailganteng", "56123",222222, 20000),
            new User("kobulganteng", "74123",333333, 50000),
        };
    }

    public User getUserByNopelanggan(String nomorPelanggan) { // alamat user yang dipilih
        User user = new User();
        for (User u : users) {
            if (nomorPelanggan.equals(u.getNomorPelanggan())){
                user = u;
                break;
            }
        }
        return user;
    }

    public void displayAllUsers() {
        for (User u : users){
            System.out.println(u.getNama());
            System.out.println(u.getNomorPelanggan());
            System.out.println(u.getPin());
            System.out.println(u.getSaldo());
        }
    }
}
