package rc.bootsecurity.model;

import javax.persistence.*;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private Integer isActive;

    @Column(nullable = false)
    private String confirmationCode;

    public Booking(Integer isActive, String confirmationCode){
        this.isActive = isActive;
        this.confirmationCode = confirmationCode;
    }

    protected Booking(){}

    public long getId() {
        return id;
    }

	public Integer getIsActive() {
		return isActive;
	}

	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}

	public String getConfirmationCode() {
		return confirmationCode;
	}

	public void setConfirmationCode(String confirmationCode) {
		this.confirmationCode = confirmationCode;
	}

}
