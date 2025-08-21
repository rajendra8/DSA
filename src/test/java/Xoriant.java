import org.testng.annotations.Test;

import java.util.*;

public class Xoriant {

//NOTE : Do more on SQL DB for client round
    @Test
    public void test(){
        String [] in={"Ram","Sheeta","Ram","Laxman","Bharat"};
        String [] in2={"Ram","Sheeta","Ram","Laxman","Bharat"};
        List<String>list=new ArrayList<>();
        Set<String>set=new LinkedHashSet<>();



        for(String a:in){
            set.add(a);
        }
        System.out.println(set);

        for (int i = 1; i < in2.length-1; i++) {
           list.add(in2[i]);
        }
        System.out.println(list);
    }
}
/**
Select
employee table
name ,id, designation

 Salary, table
   id, emp_salary


= total amount to paying to emp
= average salary of emp whose designation is not manager

SELECT SUM  FROM SALARY


SELECT AVE(emp_salary)
From Salary
 Right join Salary on Salary.id=employee.id
 Where id left join employee.id



**/