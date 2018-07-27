package assignment;

public class Medicine {

    private String mMedicineId;
    private String mMedicineName;
    private String mCompanyName;
    private int mBatch;
    private String mDOM;
    private String mDOE;
    private double mPrice;
    private int mQuantity;

    public Medicine(String medicineId, String medicineName, String companyName,
            int batch, String DOM, String DOE, double price, int quantity) {
        mMedicineId = medicineId;
        mMedicineName = medicineName;
        mCompanyName = companyName;
        mBatch = batch;
        mDOM = DOM;
        mDOE = DOE;
        mPrice = price;
        mQuantity = quantity;
    }

    public String getMedicineId() {
        return mMedicineId;
    }

    public String getMedicineName() {
        return mMedicineName;
    }

    public String getCompanyName() {
        return mCompanyName;
    }

    public int getBatch() {
        return mBatch;
    }

    public String getDOM() {
        return mDOM;
    }

    public String getDOE() {
        return mDOE;
    }

    public double getPrice() {
        return mPrice;
    }

    public int getQuantity() {
        return mQuantity;
    }

}
