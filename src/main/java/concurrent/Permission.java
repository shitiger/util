package concurrent;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/11/8
 */
public class Permission {
    /**
     * &遇0取0,|遇1取1,^相异为1
     */
    private static final int SELECT = 1 << 0;
    private static final int UPDATE = 1 << 1;
    private static final int INSERT = 1 << 2;
    private static final int DELTE = 1 << 3;

    private int permission;

    public int getPermission() {
        return permission;
    }

    public void setPermission(int permission) {
        this.permission = permission;
    }

    public void init(int permission){
        this.permission = permission;
    }

    public void enable(int select){
        this.permission = permission|select;
    }

    public void disable(int forbid){
        this.permission = permission &~ forbid;
    }

    public Boolean isQuanXian(int select){
        return (permission&select)==select;
    }

    public static void main(String[] args) {
        Permission permission = new Permission();
        permission.init(SELECT+UPDATE+INSERT+DELTE);
        int sa = permission.getPermission();
        System.out.println(Integer.toBinaryString(sa));

        permission.disable(SELECT);
        permission.disable(DELTE);
        System.out.println(permission.isQuanXian(SELECT));
    }

}
