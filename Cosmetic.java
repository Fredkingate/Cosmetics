import java.util.Date;

public class Cosmetic {

    private int CDPHid = 0;
    private String ProductName = "";
    private String CSFId = "";
    private String CSF = "";
    private String CompanyId = "";
    private String CompanyName = "";
    private String BrandName = "";
    private String PrimaryCategoryId = "";
    private String PrimaryCategory = "";
    private int SubcategoryId = 0;
    private String Subcategory = "";
    private String CasId = "";
    private String CasNumber = "";
    private String ChemicalId = "";
    private String ChemicalName = "";
    private String InitialDateReported = "";
    private String MostRecentReportDate = "";
    private String DiscontinuedDate = "";
    private String ChemnicalCreatedAt = "";
    private String ChemicalUpdatedAt = "";
    private String ChemicalDateRemoved = "";
    private String ChemicalCount = "";

    public int getCDPHid() {
        return CDPHid;
    }

    public void setCDPHid(int CDPHid) {
        this.CDPHid = CDPHid;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getCSFId() {
        return CSFId;
    }

    public void setCSFId(String CSFId) {
        this.CSFId = CSFId;
    }

    public String getCSF() {
        return CSF;
    }

    public void setCSF(String CSF) {
        this.CSF = CSF;
    }

    public String getCompanyId() {
        return CompanyId;
    }

    public void setCompanyId(String companyId) {
        CompanyId = companyId;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String brandName) {
        BrandName = brandName;
    }

    public String getPrimaryCategoryId() {
        return PrimaryCategoryId;
    }

    public void setPrimaryCategoryId(String primaryCategoryId) {
        PrimaryCategoryId = primaryCategoryId;
    }

    public String getPrimaryCategory() {
        return PrimaryCategory;
    }

    public void setPrimaryCategory(String primaryCategory) {
        PrimaryCategory = primaryCategory;
    }

    public int getSubcategoryId() {
        return SubcategoryId;
    }

    public void setSubcategoryId(int subcategoryId) {
        SubcategoryId = subcategoryId;
    }

    public String getSubcategory() {
        return Subcategory;
    }

    public void setSubcategory(String subcategory) {
        Subcategory = subcategory;
    }

    public String getCasId() {
        return CasId;
    }

    public void setCasId(String casId) {
        CasId = casId;
    }

    public String getCasNumber() {
        return CasNumber;
    }

    public void setCasNumber(String casNumber) {
        CasNumber = casNumber;
    }

    public String getChemicalId() {
        return ChemicalId;
    }
    public String getChemnicalCreatedAt() {
        return ChemnicalCreatedAt;
    }

    public void setChemnicalCreatedAt(String chemnicalCreatedAt) {
        ChemnicalCreatedAt = chemnicalCreatedAt;
    }

    public void setChemicalId(String chemicalId) {
        ChemicalId = chemicalId;
    }
    public String getChemicalName() {
        return ChemicalName;
    }

    public void setChemicalName(String chemicalName) {
        ChemicalName = chemicalName;
    }

    public String getInitialDateReported() {
        return InitialDateReported;
    }

    public void setInitialDateReported(String initialDateReported) {
        InitialDateReported = initialDateReported;
    }

    public String getMostRecentReportDate() {
        return MostRecentReportDate;
    }

    public void setMostRecentReportDate(String mostRecentReportDate) {
        MostRecentReportDate = mostRecentReportDate;
    }

    public String getDiscontinuedDate() {
        return DiscontinuedDate;
    }

    public void setDiscontinuedDate(String discontinuedDate) {
        DiscontinuedDate = discontinuedDate;
    }

    public String getChemicalUpdatedAt() {
        return ChemicalUpdatedAt;
    }

    public void setChemicalUpdatedAt(String chemicalUpdatedAt) {
        ChemicalUpdatedAt = chemicalUpdatedAt;
    }

    public String getChemicalDateRemoved() {
        return ChemicalDateRemoved;
    }

    public void setChemicalDateRemoved(String chemicalDateRemoved) {
        ChemicalDateRemoved = chemicalDateRemoved;
    }

    public String getChemicalCount() {
        return ChemicalCount;
    }

    public void setChemicalCount(String chemicalCount) {
        ChemicalCount = chemicalCount;
    }

    @Override
    public String toString() {
        return "Cosmetic{" +
                "CDPHid=" + CDPHid +
                ", ProductName='" + ProductName + '\'' +
                ", CSFId=" + CSFId +
                ", CSF='" + CSF + '\'' +
                ", CompanyId=" + CompanyId +
                ", CompanyName='" + CompanyName + '\'' +
                ", BrandName='" + BrandName + '\'' +
                ", PrimaryCategoryId=" + PrimaryCategoryId +
                ", PrimaryCategory='" + PrimaryCategory + '\'' +
                ", SubcategoryId=" + SubcategoryId +
                ", Subcategory='" + Subcategory + '\'' +
                ", CasId=" + CasId +
                ", CasNumber=" + CasNumber +
                ", ChemicalId=" + ChemicalId +
                ", ChemicalName=" + ChemicalName +
                ", InitialDateReported=" + InitialDateReported +
                ", MostRecentDateReported=" + MostRecentReportDate +
                ", DiscontinuedDate=" + DiscontinuedDate +
                ", ChemicalCreatedAt=" + ChemnicalCreatedAt +
                ", ChemicalUpdatedAt=" + ChemicalUpdatedAt +
                ", ChemicalDateRemoved=" + ChemicalDateRemoved +
                ", ChemicalCount=" + ChemicalCount +
                '}';
    }
}
