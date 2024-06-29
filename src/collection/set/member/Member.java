package collection.set.member;

import java.util.Objects;

public class Member {

    private String Id;

    public Member(String id) {
        Id = id;
    }

    public String getId() {
        return Id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(Id, member.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }

    @Override
    public String toString() {
        return "Member{" +
                "Id='" + Id + '\'' +
                '}';
    }
}
