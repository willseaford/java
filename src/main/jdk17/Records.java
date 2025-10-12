public record Record(String name, String addressLine1, String postcode) {}

void main() {
    Record record = new Record("Will", "123 Main Street", "AB123CD");
    System.out.println(record);
}