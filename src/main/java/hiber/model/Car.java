package hiber.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    public Car() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long series;

    @Column(name = "model")
    private String model;

    @OneToOne(mappedBy = "car")
    private User user;

    public Car(String model) {
        this.model = model;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getSeries() {
        return series;
    }

    public void setSeries(Long series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
