package vitaly.learning.designPatterns;
class FactoryMethod{
    public OS getCurrentOS(String inputos) {
        OS os = null;
        if (inputos.equals("windows")) {
            os = new windowsOS();
        } else if (inputos.equals("linux")) {
            os = new linuxOS();
        } else if (inputos.equals("mac")) {
            os = new macOS();
        }
        return os;
    }
}
interface OS {
    void getOS();
}
class windowsOS implements OS {
    public void getOS () {
        System.out.println("��������� ��� �������");
    }
}
class linuxOS implements OS {
    public void getOS () {
        System.out.println("��������� ��� ������");
    }
}
class macOS implements OS {
    public void getOS () {
        System.out.println("��������� ��� ���");
    }
}