import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Marshaller {
    // Define the path to your CSV file
    public Marshaller(){
    }
    public List<String> AnalyzeFile(){
    String filePath = "src/cscpopendata.csv";
            try (Scanner scanner = new Scanner(new File(filePath))) {
        // Optional: Skip the header line if your CSV has one
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
        List<String> bannedCosmetics = new ArrayList<>();
        bannedCosmetics = BannedChemicalsInCosmetics();
        List<Cosmetic>cosmetics = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            // Split the line by the comma delimiter
            String[] fields = line.split(",");
            Cosmetic cosmetic = new Cosmetic();
            // Process the fields (e.g., print them or store in objects)
            // Ensure the file has consistent formatting to avoid IndexOutOfBoundsException
            if (fields.length >= 20) { // Example check for expected number of fields
                int  id = Integer.parseInt(fields[0]);
                String productName = fields[1];
                String csfId = (fields[2]);
                if(csfId.equals("")){
                    csfId = "0";
                }
                BannedChemicalsInCosmetics();
                String csf = fields[3];
                String companyId = fields[4];
                String companyName = fields[5];
                String brandName = fields[6];
                String primaryCategoryId = fields[7];
                String primaryCategory = fields[8];
                String subcategoryId = fields[9];
                String subCategory = fields[10];
                String casId = fields[11];
                String casNumber = fields[12];
                String chemicalId = fields[13];
                String chemicalName = fields[14];
                for(String bannedComsetic: bannedCosmetics){
                    if(chemicalName.contains(bannedComsetic)){
                        System.out.println("--------");
                        System.out.println("Id:"+id +":"+ "Banned chemical:" +bannedComsetic);
                        break;
                    }
                }
                String initialDateReported = fields[15];
                for(String bannedCosmetic: bannedCosmetics){
                    if(initialDateReported.equals(bannedCosmetic)){
                        System.out.println("------------");
                        System.out.println("Id:"+id +":"+ "Banned chemical:" +bannedCosmetic);
                        break;
                    }
                }
                String mostRecentDateReported = fields[16];
                String discontinuedDate = fields[17];
                String chemicalCreatedAt = fields[18];
                String chemicalUpdatedAt = fields[19];
                String chemicalDateRemoved = fields[20];
                String chemicalCount = fields[21];
                cosmetic.setCDPHid(id);
                cosmetic.setProductName(productName);
                cosmetic.setCSFId(csfId);
                cosmetic.setCSF(csf);
                cosmetic.setCompanyId(companyId);
                cosmetic.setCompanyName(companyName);
                cosmetic.setBrandName(brandName);
                cosmetic.setPrimaryCategoryId(primaryCategoryId);
                cosmetic.setPrimaryCategory(primaryCategory);
                cosmetic.setSubcategory(subcategoryId);
                cosmetic.setSubcategory(subCategory);
                cosmetic.setCasId((casId));
                cosmetic.setCasNumber(casNumber);
                cosmetic.setChemicalId(chemicalId);
                cosmetic.setChemicalName(chemicalName);
                cosmetic.setInitialDateReported(initialDateReported);
                cosmetic.setMostRecentReportDate(mostRecentDateReported);
                cosmetic.setSubcategory(discontinuedDate);
                cosmetic.setChemnicalCreatedAt(chemicalCreatedAt);
                cosmetic.setChemicalUpdatedAt(chemicalUpdatedAt);
                cosmetic.setChemicalDateRemoved(chemicalDateRemoved);
               cosmetic.setChemicalCount(chemicalCount);
                cosmetics.add(cosmetic);
               /* System.out.println("CDPHId: " + id + ", ProductName: " + productName + ", CSFId: " + csfId + " ,CSF:" +
                        csf + ", CompanyId:" + companyId + ", CompanyName:" + companyName + "BrandName" + brandName +
                        ", PrimaryCategoryId:"+ primaryCategoryId + " ,PrimaryCategory:" + primaryCategory + ",SubCategoryId:"+
                        subcategoryId + "CasID:"+ casId + "CasNumber:" + casNumber + "ChemicalId" + chemicalId +
                        "ChemicalName" + chemicalName + "InitialDateReported" + initialDateReported +
                        "MostRecentReportDate" + mostRecentReportDate + " ,DiscontinuedDate:" + discontinuedDate +
                        ", Chemical Created at:"+ chemicalCreatedAt + ", ChemicalUpdatedAt:" + chemicalUpdatedAt +
                        ", ChemicalDateRemoved" +chemicalDateRemoved + ", ChemicalCount:"+chemicalCount );
*/
            } else {
                System.out.println("Invalid line format: " + line);
            }
        }
    } catch (
    IOException e) {
        // Handle file not found or other IO exceptions
        System.err.println("Error reading the file: " + e.getMessage());
        e.printStackTrace();
    }
        return List.of();
    }

    public List<String> BannedChemicalsInCosmetics(){
        List<String>bannedChemicals = new ArrayList<>();
        String Bithionol =  "Bithionol";
        String Choloroform = "Chloroform";
        String Chlorofluorocarbonpropellants = "Chlorofluorocarbon propellants";
        String Hexachlorophene = "Hexachlorophene";
        String Mercurycompounds = "Mercury compounds";;
        String Halogenatedsalicylanilides = "Halogenated salicylanilides";
        String lead = "Lead";
        String Metabromsalan = "metabromsalan";
        String Methylenechloride = "Methylene chloride";
        String tetrachlorosalicylanilide = "tetrachlorosalicylanilide" ;
        String ProhibitedCattleMaterial = "Prohibited cattle material"; ;
        String Sunscreen = "Sunscreen;";
        String Vinylchloride = "Vinyl chloride";
        String Zirconiumcontainingcomplexes = "Zirconium-containing complexes";;
        bannedChemicals.add(Bithionol);
        bannedChemicals.add(Choloroform);
        bannedChemicals.add(Chlorofluorocarbonpropellants);
        bannedChemicals.add(Hexachlorophene);
        bannedChemicals.add(Mercurycompounds);
        bannedChemicals.add(Halogenatedsalicylanilides);
        bannedChemicals.add(lead);
        bannedChemicals.add(Metabromsalan);
        bannedChemicals.add(Methylenechloride);
        bannedChemicals.add(tetrachlorosalicylanilide);
        bannedChemicals.add(ProhibitedCattleMaterial);// What is this?
        bannedChemicals.add(Sunscreen);
        bannedChemicals.add(Vinylchloride);
        bannedChemicals.add(Zirconiumcontainingcomplexes);
        return bannedChemicals;
    }
}
