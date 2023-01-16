package many_to_many_uni_PerLan;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Language {
	@Id
private int id;
private String name;
private String origin;
private String country;
@Override
public String toString() {
	return "Language [id=" + id + ", name=" + name + ", origin=" + origin + ", country=" + country + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getOrigin() {
	return origin;
}
public void setOrigin(String origin) {
	this.origin = origin;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
}
