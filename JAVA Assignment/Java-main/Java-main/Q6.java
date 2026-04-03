#include <iostream>
using namespace std;

class Rectangle {
private:
    int length, breadth;

public:
    // Constructor
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    // Method to calculate area
    int Area() {
        return length * breadth;
    }
};

int main() {
    // Creating objects
    Rectangle r1(4, 5);
    Rectangle r2(5, 8);

    // Printing areas
    cout << "Area of Rectangle 1: " << r1.Area() << endl;
    cout << "Area of Rectangle 2: " << r2.Area() << endl;

    return 0;
}