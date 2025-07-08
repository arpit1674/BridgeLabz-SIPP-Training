package week03_day1_LinkedList.SinglyLinkedList;

import java.util.ArrayList;

class UserNode {
    int userId;
    String name;
    int age;
    ArrayList<Integer> friendIds;
    UserNode next;

    public UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
    }
}

public class SocialMediaFriendConnections {
    UserNode head = null;

    public void addUser(int userId, String name, int age) {
        UserNode newUser = new UserNode(userId, name, age);
        if (head == null) {
            head = newUser;
        } else {
            UserNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newUser;
        }
    }

    public UserNode getUser(int userId) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == userId) return temp;
            temp = temp.next;
        }
        return null;
    }

    public void addFriend(int userId1, int userId2) {
        UserNode user1 = getUser(userId1);
        UserNode user2 = getUser(userId2);
        if (user1 != null && user2 != null) {
            if (!user1.friendIds.contains(userId2)) user1.friendIds.add(userId2);
            if (!user2.friendIds.contains(userId1)) user2.friendIds.add(userId1);
        }
    }

    public void removeFriend(int userId1, int userId2) {
        UserNode user1 = getUser(userId1);
        UserNode user2 = getUser(userId2);
        if (user1 != null && user2 != null) {
            user1.friendIds.remove(Integer.valueOf(userId2));
            user2.friendIds.remove(Integer.valueOf(userId1));
        }
    }

    public void displayFriends(int userId) {
        UserNode user = getUser(userId);
        if (user != null) {
            System.out.println("Friends of " + user.name + ":");
            for (int fid : user.friendIds) {
                UserNode f = getUser(fid);
                if (f != null) System.out.println(f.userId + " - " + f.name);
            }
        }
    }

    public void mutualFriends(int userId1, int userId2) {
        UserNode user1 = getUser(userId1);
        UserNode user2 = getUser(userId2);
        if (user1 != null && user2 != null) {
            System.out.println("Mutual friends:");
            for (int id1 : user1.friendIds) {
                if (user2.friendIds.contains(id1)) {
                    UserNode mutual = getUser(id1);
                    System.out.println(mutual.userId + " - " + mutual.name);
                }
            }
        }
    }

    public void searchUser(String name) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println("Found: " + temp.userId + " - " + temp.name);
                return;
            }
            temp = temp.next;
        }
        System.out.println("User not found.");
    }

    public void countFriends() {
        UserNode temp = head;
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.friendIds.size() + " friends.");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SocialMediaFriendConnections sm = new SocialMediaFriendConnections();
        sm.addUser(1, "Alice", 22);
        sm.addUser(2, "Bob", 24);
        sm.addUser(3, "Charlie", 21);
        sm.addUser(4, "David", 23);

        sm.addFriend(1, 2);
        sm.addFriend(1, 3);
        sm.addFriend(2, 3);
        sm.addFriend(3, 4);

        sm.displayFriends(1);
        sm.mutualFriends(1, 2);
        sm.searchUser("David");
        sm.countFriends();
    }
}

