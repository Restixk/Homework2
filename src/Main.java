public class Main {
    public static void main(String[] args)
    {   var dog= 8.0;
        var cat=3.6;
        var paper=763789;
        dog=dog+4;
        cat=cat+4;
        paper=paper+4;
        dog=dog-3.5;
        cat=cat-1.6;
        paper=paper-7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend=19;
        friend=friend+2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);
        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);
        var boxerWeight1=78.2;
        var boxerWeight2=82.7;
        var boxerTotalWeight=boxerWeight1 + boxerWeight2;
        System.out.println("Общий вес боксеров " + boxerTotalWeight + " Кг!");
        var weightDifference = boxerWeight2 - boxerWeight1;
        System.out.println("Разница весов " + weightDifference + " Кг!");
        weightDifference = boxerWeight2  % boxerWeight1;
        System.out.println("Разница весов " + weightDifference + " Кг!");
        var generalWorkingHours = 640;
        var individualWorkingHours = 8;
        var peopleCompany = generalWorkingHours / individualWorkingHours;
        System.out.println("Всего работников в компании - " + peopleCompany +  " человек!");
        peopleCompany = peopleCompany + 94;
        individualWorkingHours = generalWorkingHours / peopleCompany;
        System.out.println("Еслив компании работает " + peopleCompany + " человек, то всего " + individualWorkingHours +  " часов работы можеть быть поделено между сотрудниками ");
    }
}