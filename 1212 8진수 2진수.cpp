#include <cstdio>

int main() {
	char arr[333335];
	fgets(arr, sizeof(arr), stdin);
	int size = 0;
	for (int i = 0; i < 333335; i++) {
		if (arr[i] == '\n') {
			arr[i] = '\0';
			break;
		}
		size++;
	}
	if (arr[0] == '0') {
		printf("0");
	}
	else {
		switch (arr[0]) {
			case '1': printf("1"); break;
			case '2': printf("10"); break;
			case '3': printf("11"); break;
			case '4': printf("100"); break;
			case '5': printf("101"); break;
			case '6': printf("110"); break;
			case '7': printf("111"); break;
		}
		for (int i = 1; i < size; i++) {
			switch (arr[i]) {
				case '0': printf("000"); break;
				case '1': printf("001"); break;
				case '2': printf("010"); break;
				case '3': printf("011"); break;
				case '4': printf("100"); break;
				case '5': printf("101"); break;
				case '6': printf("110"); break;
				case '7': printf("111"); break;
			}
		}
	}
}
