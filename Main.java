package Driver;
import Property.*;

public class Main {
    public static void main(String[] args) {
        AdminDepartment admin =new AdminDepartment();
        HrDepartment hr=new HrDepartment();
        TechDepartment tech=new TechDepartment();

        //adminD
        System.out.println("Welcome too "+admin.departmentName());
        System.out.println(admin.getTodayWork());
        System.out.println(admin.getWorkDeadLine());
        System.out.println(admin.isTodayAHoliday());
        System.out.println();

        //hrD
        System.out.println("Welcome too "+hr.departmentName());
        System.out.println(hr.doActivity());
        System.out.println(hr.getTodaysWork());
        System.out.println(hr.isTodayAHoliday());
        System.out.println();

        //techD
        System.out.println("Welcome too "+tech.departmentName());
        System.out.println(tech.getTodaysWork());
        System.out.println(tech.getWorkDeadline());
        System.out.println(tech.doActivity());
        System.out.println(tech.isTodayAHoliday());
        System.out.println();
    }
}
