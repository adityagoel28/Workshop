package Workshop;

import java.time.LocalDate;

public class Loan {
    private Book book;
    private Member member;
    private LocalDate dueDate;

    public Loan(Book book, Member member, LocalDate dueDate) {
        this.book = book;
        this.member = member;
        this.dueDate = dueDate;
    }

    public Book getBook(){
        return book;
    }

    public Member getMember(){
        return member;
    }

    public LocalDate getDueDate(){
        return dueDate;
    }

    @Override
    public String toString(){
        return "Book: " + book + " Member: " + member + " Due Date: " + dueDate + "\n";
    }

}
