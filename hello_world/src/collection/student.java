package collection;

public class student {
 int id;
 String name;
 String collage;
 
 student(int id,String name,String collage){
	 
	 this.id=id;
	 this.name=name;
	 this.collage=collage;
	 
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

public String getCollage() {
	return collage;
}

public void setCollage(String collage) {
	this.collage = collage;
}

@Override
public String toString() {
	return "student [id=" + id + ", name=" + name + ", collage=" + collage + "]";
}

public student() {
	super();
}




	
	
	
}
