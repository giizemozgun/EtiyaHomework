package kodlamaio.hrms.entities.concretes;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "active_position")
public class ActivePosition {
	
	@Id
	@GeneratedValue
	@Column(name = "position_id")
	private int positionId;
	
	@Column(name = "position_name")
	private String positionName;

}

