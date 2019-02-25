import javax.persistence.*;

@Entity
@Table(name = "primer")
public class Primer {
    @Id
    @Column(name = "primer_id")
    int primer_id;

    @Column(name = "first_name")
    String first_name;

}
