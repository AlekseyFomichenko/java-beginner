import java.util.Random;

public class Laptop {
    public Integer ram;
    public String name;
    public Integer ssd;
    public String cpu;
    public String gpu;
    public String color;
    public String OS;

    public Laptop(){

    }

    public void randomLaptop(){
        Random random = new Random();
        LaptopArrays arrays = new LaptopArrays();

        name = arrays.randomName(this.name, random);
        ram = arrays.randomRAM(this.ram, random);
        cpu = arrays.randomCPU(this.cpu, random);
        ssd = arrays.randomSSD(this.ssd, random);
        gpu = arrays.randomGPU(this.gpu, random);
        OS = arrays.randomOS(this.OS, random);
        color = arrays.randomColor(this.color, random);
    }

    public void info(){
        System.out.printf("Name: %s\nCPU: %s\nRAM: %dGb\nSSD: %dGb\nGPU: %s\nOS: %s\nColor: %s\n\n", 
                            this.name, 
                            this.cpu, 
                            this.ram, 
                            this.ssd, 
                            this.gpu, 
                            this.OS, 
                            this.color);
    }


}
