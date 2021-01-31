package entities;
import java.time.LocalDate;

public class Group {
 int groupId ;
 String groupName ;
 Account creatorId ;
 LocalDate createDate ;
 Account[] accounts ;
}
