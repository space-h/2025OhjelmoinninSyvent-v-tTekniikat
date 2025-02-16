import java.util.Comparator;
import java.util.Objects;

/**
 * The category of an event, with primary and secondary categories.
 */
public class Category implements Comparable<Category> {
    private String primary;
    private String secondary;

    /**
     * Constructs a category with primary and secondary values.
     * 
     * @param primary the primary category
     * @param secondary the secondary category
     */
    public Category(String primary, String secondary) {
        this.primary = primary;
        this.secondary = secondary;
    }

    /**
     * Parse a category string in the format "primary"
     * or "primary/secondary" and make a category of them.
     * Folds the category parts to lower case.
     * Throws java.lang.IllegalArgumentException if the
     * string is of the wrong format.
     * 
     * @param categoryString the string to parse
     * @return new category
     */
    public static Category parse(String categoryString) {
        if (categoryString == null || 
            categoryString.isEmpty() ||
            categoryString.isBlank()) {
            throw new IllegalArgumentException("invalid category string");
        }

        String[] categoryParts = categoryString.split("/");
        String primary = categoryParts[0].toLowerCase();
        String secondary = null;
        if (categoryParts.length == 2) {
            secondary = categoryParts[1].toLowerCase();
        }
        return new Category(primary, secondary);
    }

    /**
     * Gets the primary category.
     * 
     * @return primary
     */
    public String getPrimary() {
        return this.primary;
    }

    /**
     * Gets the secondary category.
     * 
     * @return secondary
     */
    public String getSecondary() {
        return this.secondary;
    }

    /**
     * Returns a string representation of this category.
     * 
     * @return category as string 
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.primary);
        if (this.secondary != null) {
            sb.append("/");
            sb.append(this.secondary);
        }
        return sb.toString();
    }

    /**
     * Tests for equality with another category.
     * 
     * @return true if categories are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        // Identical references?
        if (o == this) return true;

        // Correct type and non-null?
        if (!(o instanceof Category)) return false;

        // Cast to our type:
        Category that = (Category) o;

        if (this.primary.equals(that.primary) && this.secondary.equals(that.secondary)) {
            return true;
        }

        return false;
    }

    /**
     * Returns a hash code for this category.
     * 
     * @return hash code computed based on primary and secondary categories
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.primary, this.secondary);
    }

    @Override
    public int compareTo(Category other) {
        int result = Objects.compare(
            this.primary, 
            other.getPrimary(),
            Comparator.naturalOrder());
        if (result != 0) {
            return result;
        }

        return Objects.compare(
            this.secondary,
            other.getSecondary(),
            Comparator.naturalOrder());
    }
}
