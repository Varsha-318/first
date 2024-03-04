package collections;
import java.util.Objects;
import java.util.LinkedList;
public class Emp {
        int id;
        String name;
        public Emp(int id,String name) {
        	this.id=id;
        	this.name=name;
        }
    @Override
        public String toString() {
        	return "Emp [id=" + id + ", name=" + name + "]";
    	}
    @Override
    public int hashCode() {
    	return Objects.hash(id, name);
    }
    @Override
    public boolean equals(Object obj) {
    	if (this == obj)
    		return true;
    	if (obj == null)
    		return false;
    	if (getClass() != obj.getClass())
    		return false;
    	Emp other = (Emp) obj;
    	return id == other.id && Objects.equals(name, other.name);
    }
     
    public static void main(String[] args) {
    	LinkedList<Emp> l = new LinkedList();
    	l.add(new Emp(101, "tom"));
    	l.add(new Emp(102, "ana"));
    	l.add(new Emp(103, "sana"));
    	l.add(new Emp(104, "priya"));
     
    	for(Object o : l) {
    		System.out.println(o);
    	}
    }
}
