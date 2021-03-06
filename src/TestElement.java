public class TestElement {

    public static void main(String[] args) {
        Element[] chemicals = {
                new Element("Hydrojen", "H", 1.088, 1, 1),
                new Element("Helium", "He", 4.0026, 1, 18),
                new Element("Lithium", "Li", 6.94, 2, 1),
                new Element("Berilyum", "Be", 9.0112, 2, 2)
        };

        double totalWeight = 0.0;
        for (Element el: chemicals) {
            totalWeight += el.getWeight();
        }

        double averageWeight = totalWeight / chemicals.length;
        System.out.printf("Average atomic weight: %.3f\n", averageWeight);
    }
}
