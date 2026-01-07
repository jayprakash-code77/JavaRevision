package OOP.Inheritance;
class SevenXLab {
    String founder = "Jayprakash";
    int totalInvestedValue = 3432;

    int investedAmmount() {
        return this.totalInvestedValue;
    }
}


class Development extends SevenXLab {
    String Dev_HOD = "Jay Pranash Maurya";

    String getHOD() {
        return Dev_HOD;
    }
}


class BlockchainTech extends SevenXLab {
    String BChain_HOD = "JP";

    String getBChain_HOD() {
        return BChain_HOD;
    }
}
public class HierarchicalInheritance {
    public static void main(String args[]) {
        BlockchainTech bt = new BlockchainTech();
        System.out.println(bt.founder);

    }
}

