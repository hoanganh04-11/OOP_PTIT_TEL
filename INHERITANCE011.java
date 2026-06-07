package oop_tel_ptit;

import java.util.*;

class Asset {
    private String name;
    private double value;
    private Date acquisitionDate;
    
    public Asset(String name, double value, Date acquisitionDate){
        this.name = name;
        this.value = value;
        this.acquisitionDate = acquisitionDate;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getValue(){
        return this.value;
    }
    
    public double getDepreciation(){
        return value;
    }
    
    @Override
    public String toString(){
        return "Asset Name: " + name + "\n" +
                "Asset Value: " + value + "\n" +
                "Depreciation: " + getDepreciation() + "\n" +
                "---------------------------" + "\n";
    }
}

class FixedAsset extends Asset {
    private double usefulLife;
    
    public FixedAsset(String name, double value, Date acquisitionDate, double usefulLife){
        super(name, value, acquisitionDate);
        this.usefulLife = usefulLife;
    }
    
    @Override
    public double getDepreciation(){
        return super.getValue() / usefulLife;
    }
}

class CurrentAsset extends Asset {
    private double liquidationValue;
    
    public CurrentAsset(String name, double value, Date acquisitionDate, double liquidationValue){
      super(name, value, acquisitionDate);
      this.liquidationValue = liquidationValue;
    }
    
    @Override
    public double getDepreciation(){
        return super.getValue() * 0.1;
    }
}

class IntangibleAsset extends Asset {
    private double amortizationPeriod;
    
    public IntangibleAsset(String name, double value, Date acquisitionDate, double amortizationPeriod){
      super(name, value, acquisitionDate);
      this.amortizationPeriod = amortizationPeriod;
    }
    
    @Override
    public double getDepreciation(){
        return super.getValue() / amortizationPeriod;
    }
}

class AssetManager {
    private List<Asset> assets;
    
    public AssetManager(){
        assets = new ArrayList<>();
    }
    
    public void addAsset(Asset asset){
        assets.add(asset);
    }
    
    public double getTotalValue(){
        double res = 0;
        for(Asset asset : assets){
            res += asset.getValue();
        }
        return res;
    }
    
    public double getTotalDepreciation(){
        double res = 0;
        for(Asset asset : assets){
            res += asset.getDepreciation();
        }
        return res;
    }
    
    public void displayAssets(){
        for(Asset a : assets){
            System.out.println(a);
        }
    }
}

public class INHERITANCE011 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        
        AssetManager manager = new AssetManager();
        for(int i=0; i<n; i++){
            String[] parts = sc.nextLine().trim().split("\\s+");
            String type = parts[0];
            String name = parts[1];
            double value = Double.parseDouble(parts[2]);
            double extra = Double.parseDouble(parts[3]);
            
            if(type.equals("FixedAsset")){
                manager.addAsset(new FixedAsset(name, value, null, extra));
            }
            else if(type.equals("IntangibleAsset")){
                manager.addAsset(new IntangibleAsset(name, value, null, extra));
            }
            else if(type.equals("CurrentAsset")){
                manager.addAsset(new CurrentAsset(name, value, null, extra));
            }
        }
        manager.displayAssets();
        System.out.printf("Total Value of Assets: %.1f\n", manager.getTotalValue());
        System.out.printf("Total Depreciation of Assets: %.1f", manager.getTotalDepreciation());
    }
}
