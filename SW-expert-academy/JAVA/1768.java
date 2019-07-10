class UserSolution {
	public final static int N = 4;

	static int[] number = new int[5041];
	static boolean[] num = new boolean[9877];
	static int idx = 0;
	static boolean flag = true;

	void init() {
		if(flag) {
			flag = false;
			for(int i=0123;i<=9876;i++) {
				int a = i / 1000;
				int b = i % 1000 / 100;
				int c = i % 100 / 10;
				int d = i % 10;

				if(a!=b && a!=c && a!=d && b!=c && b!=d && c!=d) {
					number[idx++] = i;
				}
			}
		}
		for(int i=0;i<idx;i++)
			num[number[i]] = true;
	}

	Solution.Result compare(int n,int c) {
		Solution.Result r = new Solution.Result();
		r.ball = 0;
		r.strike = 0;
		int[] chk = new int[10];

		for(int i=0;i<4;i++) {
			if(n%10==c%10)
				r.strike++;
			else {
				chk[n%10]++;
				chk[c%10]++;	
			}
			n/=10;
			c/=10;
		}

		for(int i=0;i<10;i++)
			if(chk[i]==2)
				r.ball++;

		return r;
	}
	public void doUserImplementation(int guess[]) {
		// Implement a user's implementation function
		//
		// The array of guess[] is a return array that
		// is your guess for what digits[] would be.
		init();

		while(true) {
			int ans = 0;
			for(int i=0;i<idx;i++) {
				if(num[number[i]]) {
					ans = number[i];

					guess[0] = ans / 1000;
					guess[1] = ans % 1000 / 100;
					guess[2] = ans % 100 / 10;
					guess[3] = ans % 10;
					break;
				}
			}
			Solution.Result r = Solution.query(guess);
			if(r.strike == 4)
				break;
			else
				num[ans] = false;

			for(int i=0;i<idx;i++) {
				if(num[number[i]]) {
					Solution.Result r2 = compare(ans,number[i]);
					if(r.strike != r2.strike || r.ball != r2.ball) 
						num[number[i]] = false;

				}
			}
		}
	}
}
