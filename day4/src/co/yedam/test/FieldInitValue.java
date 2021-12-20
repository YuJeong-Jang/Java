package co.yedam.test;

import java.util.Arrays;

/*기본 데이터형 8타입은 기본값은 0으로 초기화됨
 * 참조변수(String, [])등은 null로 초기화됨
 */
public class FieldInitValue {
byte b;
short s;
int i;
long l;
float f;
double d;
boolean bool;
char c;
String str;
int[] arr;
FieldInitValue(int num1, double num2){
	i = num1;
	d = num2;
	}
@Override
public String toString() {
	return "FiledInitValue [b=" + b + ", s=" + s + ", i=" + i + ", l=" + l + ", f=" + f + ", d=" + d + ", bool=" + bool
			+ ", c=" + c + ", str=" + str + ", arr=" + Arrays.toString(arr) + "]";
}

}
