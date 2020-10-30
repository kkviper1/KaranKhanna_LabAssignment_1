/**
 * 
 * @author karan
 * 
 */

/*
 * 
 * Superclass Item defines the fields for id, title and number of copies, the class also provides the necessary constructors, getters and setters
 * and overrides the toString(), equals() and hashCode() methods
 */
abstract class Item {
    protected int id;
    protected String title;
    protected int copies;

    abstract String print();

    public Item(int id, String title, int copies) {
        this.id = id;
        this.title = title;
        this.copies = copies;
        
    }

    public Item() {
        id = 2;
        title = "hamlet";
        copies = 10;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
            this.id = id;
    }

    public String getTitle() {
            return this.title;
    }

    public void setTitle(String title) {
                this.title = title;
    }

    public int getCopies() {
        return this.copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;

    }

    @Override
    public String toString() {
        return "Item [id=" + id + ", title=" + title + ", copies=" + copies + "]";
    }

    @Override
    public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime*result + copies;
            result += result*prime*id;
            return result;
    }

    @Override
    public boolean equals(Object obj) {
            if(this == obj)
            return true;
            if(obj == null)
            return false;
            if(getClass() != obj.getClass())
            return false;
            Item other = (Item) obj;
            if(copies != other.copies)
            return false;
            if (id != other.id)
			return false;
    		if (title == null) {
    			if (other.title != null)
    				return false;
    		} else if (!title.equals(other.title))
    			return false;
    		return true;
    }

}
