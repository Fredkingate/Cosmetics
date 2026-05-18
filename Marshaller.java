import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Marshaller {
    protected int leadCount = 0;
    protected int formaldehydeCount = 0;
    protected int methyleneChlorideCount = 0;
    protected int glycerinCount = 0;
    int[] values ={leadCount,formaldehydeCount,methyleneChlorideCount,glycerinCount};
    String [] labels = {"Lead","Formaldehyde","MethyleneChloride,Glycerin"};
    // Define the path to your CSV file
    public Marshaller(){
    }
    public List<String> AnalyzeFile(){
    String filePath = "src/cscpopendata.csv";
            try (Scanner scanner = new Scanner(new File(filePath))) {
        // Optional: Skip the header line if your CSV has one
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        List<String> bannedChemicalsInCosmetics = new ArrayList<>();
        bannedChemicalsInCosmetics = BannedChemicalsInCosmetics();
        List<Cosmetic> cosmetics = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            // Split the line by the comma delimiter
            String[] fields = line.split(",");
            Cosmetic cosmetic = new Cosmetic();
            // Process the fields (e.g., print them or store in objects)
            // Ensure the file has consistent formatting to avoid IndexOutOfBoundsException
            if (fields.length >= 21) {
                int id = Integer.parseInt(fields[0]);
                String productName = fields[1];
                for(String bannedComsetic: bannedChemicalsInCosmetics){
                    if(productName.contains(bannedComsetic)){
                        System.out.println("--------");
                        System.out.println("Id:"+id +":"+" Product Name " + productName +  ":" + "Banned chemical:" +bannedComsetic);
                        if(productName.contains("Glycerin")){
                            glycerinCount = glycerinCount+1;
                        }
                    }
                }
                String csfId = (fields[2]);
                if(csfId.equals("")){
                    csfId = "0";
                }
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
                    if(chemicalName.contains("Lead")){
                        leadCount = leadCount + 1;
                        System.out.println("--------");
                        System.out.println("Id:"+id +":"+" Product Name " + productName + "Brand name:" + brandName + ":" + "Banned chemical:" + chemicalName);
                    }
                    if(chemicalName.contains("Formaldehyde")) {
                        formaldehydeCount = formaldehydeCount + 1;
                    }
                    if(chemicalName.contains("Methylene chloride")){
                        methyleneChlorideCount = methyleneChlorideCount + 1;
                    }
                    if(chemicalName.contains("Glycerin")){
                        glycerinCount = glycerinCount + 1;
                    }

                String initialDateReported = fields[15];
                for(String bannedCosmetic: bannedChemicalsInCosmetics){
                    if(initialDateReported.equals(bannedCosmetic)){
                        System.out.println("------------");
                        System.out.println("Id:"+id +":"+ "Banned chemical:" +bannedCosmetic);
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
                        "MostRecentReportDate" + mostRecentDateReported + " ,DiscontinuedDate:" + discontinuedDate +
                        ", Chemical Created at:"+ chemicalCreatedAt + ", ChemicalUpdatedAt:" + chemicalUpdatedAt +
                        ", ChemicalDateRemoved" +chemicalDateRemoved + ", ChemicalCount:"+chemicalCount );
*/
            } else {
                System.out.println("Invalid line format: " + line);
            }
        }
            System.out.println("Number of cosmetic products that contain Lead:"+leadCount);
            System.out.println(("Number of products that contain Formaldehyde:"+formaldehydeCount));
            System.out.println("Number of products that contain Methylene chloride:"+methyleneChlorideCount);
            System.out.println("Number of products that contain Glycerin:"+glycerinCount);
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
        String Formaldehyde = "Formaldehyde";
        String Glycerin = "Glycerin";
        String Hexachlorophene = "Hexachlorophene";
        String Mercurycompounds = "Mercury compounds";;
        String Halogenatedsalicylanilides = "Halogenated salicylanilides";
        String lead = "Lead";
        String Metabromsalan = "metabromsalan";
        String Methylenechloride = "Methylene chloride";
        String Methyleneglycol = "Methylene glycol ";
        String tetrachlorosalicylanilide = "tetrachlorosalicylanilide" ;
        String ProhibitedCattleMaterial = "Prohibited cattle material";
        String ProhibitedCattleMaterialExample = "Brain,Skull,Tonsils,Trigeminal Ganglia(Nerve Tissue Near Skull), " +
                "Eyes," + " Spinal Cord, Dorsal Root Ganglia(Nerve Tissue)," + " Distal Ileum(Small intestines)";
        String Sunscreen = "Sunscreen;";
        String Vinylchloride = "Vinyl chloride";
        String Zirconiumcontainingcomplexes = "Zirconium-containing complexes";;
        bannedChemicals.add(Bithionol);
        bannedChemicals.add(Choloroform);
        bannedChemicals.add(Chlorofluorocarbonpropellants);
        bannedChemicals.add(Glycerin); // Is the Glycerin derived from the Bovidae family?
        bannedChemicals.add(Hexachlorophene);
        bannedChemicals.add(Mercurycompounds);
        bannedChemicals.add(Formaldehyde);
        bannedChemicals.add(Halogenatedsalicylanilides);
        bannedChemicals.add(lead);
        bannedChemicals.add(Metabromsalan);
        bannedChemicals.add(Methylenechloride);
        bannedChemicals.add(Methyleneglycol);
        bannedChemicals.add(tetrachlorosalicylanilide);
        bannedChemicals.add(ProhibitedCattleMaterial);
        bannedChemicals.add(ProhibitedCattleMaterialExample);
        bannedChemicals.add(Sunscreen);
        bannedChemicals.add(Vinylchloride);
        bannedChemicals.add(Zirconiumcontainingcomplexes);
        return bannedChemicals;
    }

}
