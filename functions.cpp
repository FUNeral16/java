// functions.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <string>
using namespace std;

//parent class
class One
{
    //data members

protected: 
    double a;

public:
    One(double = 2.0);//constructor
     double virtual f1(double);//function 1
    double f2(double);//function 2
};

//functions implementations

One::One(double val)
{
    a = val;
}
double One:: f1(double num)
{
    return (num / 2);
}
double One::f2(double num)
{
    return (pow(f1(num), 2));
}

//child class
//call data member using a because of inheritance
//inherits all three functions from parent class including constructors 
class Two :public One
{
public:
    double f1(double);


};
double Two::f1(double num)
{
    return (num / 3);
}



int main()
{
    One object1;//base class
    Two object2;// child class

    //call the class member function
    cout << "The computed using a base class object call is: " << endl;
    cout << object1.f2(12) << endl;
    cout << object2.f2(12) << endl;
 





}

//How to bypass Arguments to functions:
//1) by values (using Resource Memory Adress) Ex: int f1(int b); int a=5; 
//2)by refrence 
//3)using pointers: a variable holding the adress of another variable or a function.
//  ex: int a=5;
//      int *b;
//      int *b=&a;
//      b=1;