package entities;

import javax.persistence.*;
import java.util.List;
@Entity
public class Salle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String code;

    @OneToMany(mappedBy = "salle", fetch = FetchType.EAGER)
    private List<Machine> machines;

    public Salle() {
    }

    public Salle(int id, String code, List<Machine> machines) {
        this.id = id;
        this.code = code;
        this.machines = machines;
    }

    public Salle(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Machine> getMachines() {
        return machines;
    }

    public void setMachines(List<Machine> machines) {
        this.machines = machines;
    }
}
