package Workshop;

import java.time.LocalDate;
import java.util.*;

public class Library { // Class
    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();
    private Map<Book, Loan> loans = new HashMap<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void addMember(Member member){
        members.add(member);
    }

    public void checkOutBook(Book book, Member member, LocalDate dueDate){
        if(books.contains(book) && !loans.containsKey(book)) {
            loans.put(book, new Loan(book, member, dueDate));
            System.out.println("Book is checked out");
        } else{
            System.out.println("Book is not available");
        }
    }

    public void checkInBook(Book book){
        if(loans.containsKey(book)){
            loans.remove(book);
            System.out.println("Book is checked in");
        } else{
            System.out.println("Book is not checked out");
        }
    }

    public double CalculateFine(Member member){
        double fine = 0;
        LocalDate today = LocalDate.now();
        for(Loan loan : loans.values()){
            if(loan.getMember().equals(member) && loan.getDueDate().isBefore(today)){
                fine += 100;
            }
        }
        return fine;
    }


    public void printBooks(){
        for(Book book : books){
            System.out.println(book);
        }
    }

    public void printMembers(){
        for(Member member : members){
            System.out.println(member);
        }
    }

    public void printCheckedOutBooks(){
        if(loans.isEmpty()){
            System.out.println("No books are checked out");
        }
        for(Loan loan : loans.values()){
            System.out.println(loan);
        }
    }

    public String printOverdueBooks(){
        String overdueBooks = "";
        for(Loan loan : loans.values()){
            if(loan.getDueDate().isBefore(LocalDate.now())){
                overdueBooks += loan;
            }
        }
        return overdueBooks;
    }

    public Book findBookByTitle(String title) {
        for(Book book : books){
            if(book.getTitle().equals(title)){
                return book;
            }
        }
        return null;
    }

    public Member findMemberByName(String name) {
        for(Member member : members){
            if(member.getName().equals(name)){
                return member;
            }
        }
        return null;
    }
}
