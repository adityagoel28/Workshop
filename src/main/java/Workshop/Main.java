package Workshop;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Library Management System!");

        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Check Out Book");
            System.out.println("4. Check In Book");
            System.out.println("5. Calculate Fine");
            System.out.println("6. Print Books");
            System.out.println("7. Print Members");
            System.out.println("8. Print Checked Out Books");
            System.out.println("9: Print Overdue Books");
            System.out.println("10. Exit");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter title");
                    String title = sc.next();
                    System.out.println("Enter author");
                    String author = sc.next();
                    System.out.println("Enter publisher");
                    String publisher = sc.next();
                    System.out.println("Enter genre");
                    String genre = sc.next();
                    System.out.println("Enter pages");
                    int pages = sc.nextInt();
                    Book book1 = new Book(title, author, publisher, genre, pages);
                    library.addBook(book1);
                    break;
                case 2:
                    System.out.println("Enter name");
                    String name = sc.next();
                    System.out.println("Enter address");
                    String address = sc.next();
                    System.out.println("Enter phone number");
                    String phoneNumber = sc.next();
                    System.out.println("Enter email");
                    String email = sc.next();
                    Member member1 = new Member(name, address, phoneNumber, email);
                    library.addMember(member1);
                    break;
                case 3:
                    System.out.println("Enter title of the book to check out");
                    title = sc.next();
                    Book book2 = library.findBookByTitle(title);
                    if(book2 == null){
                        System.out.println("Book not found");
                        return;
                    }
                    System.out.println("Enter member name");
                    String memberName = sc.next();
                    Member member2 = library.findMemberByName(memberName);
                    if(member2 == null){
                        System.out.println("Member not found");
                        return;
                    }
                    System.out.println("Enter due date");
                    LocalDate dueDate = LocalDate.parse(sc.next());
                    library.checkOutBook(book2, member2, dueDate);
                    break;
                case 4:
                    System.out.println("Enter title of the book to check in");
                    title = sc.next();
                    book2 = library.findBookByTitle(title);
                    if(book2 == null){
                        System.out.println("Book not found");
                        return;
                    }
                    library.checkInBook(book2);
                    break;
                case 5:
                    System.out.println("Enter name of the member to calculate fine");
                    String fineName = sc.next();
                    Member fineMember = library.findMemberByName(fineName);
                    if(fineMember == null){
                        System.out.println("Member not found");
                        return;
                    }
                    double fine = library.CalculateFine(fineMember);
                    System.out.println("Fine: " + fine);
                    break;
                case 6:
                    library.printBooks();
                    break;
                case 7:
                    library.printMembers();
                    break;
                case 8:
                    library.printCheckedOutBooks();
                    break;
                case 9:
                    String overdueBooks = library.printOverdueBooks();
                    System.out.println(overdueBooks);
                    break;
                case 10:
                    return;
            }
        }
    }
}