//#include <iostream>
//#include <string>
//
//int sumLetters(const std::string& word) 
//{
//	int sum = 0;
//	for (int i = 0; i < word.length(); i++)
//	{
//		if (word[i] >= 'a' && word[i] <= 'z')
//			sum += (word[i] - 'a') + 1;
//		else
//			sum += (word[i] - 'A') + 1;
//	}
//
//	return sum;
//}
//
//int main() 
//{
//	int n;
//	std::cin >> n;
//
//	int maxSum = 0;
//	std::string maxWord;
//	for (int i = 0; i < n; i++)
//	{
//		std::string word;
//		std::cin >> word;
//		int res = sumLetters(word);
//		if (res > maxSum)
//		{
//			maxSum = res;
//			maxWord = word;
//		}
//	}
//	
//	std::cout << maxSum << " " << maxWord << std::endl;
//
//	return 0;
//}