import java.util.Random;

public class LaptopArrays {

    public String randomName(String name, Random random) {
        String[] arrayName = new String[10];
        arrayName[0] = "Aser";
        arrayName[1] = "Asus";
        arrayName[2] = "MSI";
        arrayName[3] = "Huawei";
        arrayName[4] = "Gigabite";
        arrayName[5] = "Adata XPG";
        arrayName[6] = "DELL";
        arrayName[7] = "HP";
        arrayName[8] = "Lenovo";
        arrayName[9] = "Samsung";
        return name = arrayName[random.nextInt(arrayName.length - 1)];
    }

    public String randomCPU(String cpu, Random random){
        String[] arrayCPU = new String[7];
        arrayCPU[0] = "AMD Ryzen 5 5625U";
        arrayCPU[1] = "Intel Core i5 12450H";
        arrayCPU[2] = "AMD Ryzen 7 5800U";
        arrayCPU[3] = "AMD Ryzen 5 6600H";
        arrayCPU[4] = "Intel Core i7 12700H";
        arrayCPU[5] = "Intel Core i7 10870H";
        arrayCPU[6] = "Intel Core i7 1165G7";
        return cpu = arrayCPU[random.nextInt(arrayCPU.length - 1)];
    }
    public Integer randomRAM(Integer ram, Random random){
        Integer[] arrayRAM = new Integer[6];
        arrayRAM[0] = 8;
        arrayRAM[1] = 16;
        arrayRAM[2] = 32;
        arrayRAM[3] = 64;
        arrayRAM[4] = 12;
        arrayRAM[5] = 24;
        return ram = arrayRAM[random.nextInt(arrayRAM.length - 1)];
    }
    public Integer randomSSD(Integer ssd, Random random){
        Integer[] arraySSD = new Integer[5];
        arraySSD[0] = 128;
        arraySSD[1] = 256;
        arraySSD[2] = 512;
        arraySSD[3] = 1024;
        arraySSD[4] = 2048;
        return ssd = arraySSD[random.nextInt(arraySSD.length - 1)];
    }
    public String randomGPU(String gpu, Random random){
        String[] arrayGPU = new String[7];
        arrayGPU[0] = "RTX 3050";
        arrayGPU[1] = "RTX 3050 Ti";
        arrayGPU[2] = "RTX 3060";
        arrayGPU[3] = "RTX 3070 Ti";
        arrayGPU[4] = "RTX 3080";
        arrayGPU[5] = "RTX 4060";
        arrayGPU[6] = "RTX 2080 Super";
        return gpu = arrayGPU[random.nextInt(arrayGPU.length - 1)];
    }
    public String randomOS(String os, Random random){
        String[] arrayOS = new String[7];
        arrayOS[0] = "Windows 11 Home";
        arrayOS[1] = "Windows 11 Pro";
        arrayOS[2] = "No OC";
        arrayOS[3] = "Free DOS";
        arrayOS[4] = "EShell";
        arrayOS[5] = "Linux.Ubuntu";
        arrayOS[6] = "Windows 11 Trial";
        return os = arrayOS[random.nextInt(arrayOS.length - 1)];
    }
    public String randomColor(String color, Random random){
        String[] arrayColor = new String[7];
        arrayColor[0] = "black";
        arrayColor[1] = "white";
        arrayColor[2] = "grey";
        arrayColor[3] = "grafite";
        arrayColor[4] = "space grey";
        arrayColor[5] = "green";
        arrayColor[6] = "metalic";
        return color = arrayColor[random.nextInt(arrayColor.length - 1)];
    }
}
