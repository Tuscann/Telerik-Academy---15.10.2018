//#include <iostream>
//#include <string>
//
//bool isConstant(const std::string& word) 
//{
//	for (int i = 0; i < word.length(); i++)
//	{
//		if (word[i] < 'A' || word[i] > 'Z')
//			return false;
//	}
//
//	return true;
//}
//
//bool isField(const std::string& word) 
//{
//	for (int i = 0; i < word.length(); i++)
//	{
//		if (word[i] < 'a' || word[i] > 'z')
//			return false;
//	}
//
//	return true;
//}
//
//bool isPascal(const std::string& word) 
//{
//	if (word[0] < 'A' || word[0] > 'Z')
//		return false;
//
//	for (int i = 1; i < word.length(); i++)
//	{
//		if (word[i] < 'a' || word[i] > 'z')
//			return false;
//	}
//
//	return true;
//}
//
//bool isElephant(const std::string& word) 
//{
//	int i = 0;
//	for (; i < word.length(); i++)
//	{
//		if (word[i] < 'a' || word[i] > 'z')
//			break;
//	}
//
//	if (word.length() == i)
//		return false;
//
//	for (int j = i; j < word.length(); j++)
//	{
//		if (word[j] < 'A' || word[j] > 'Z')
//			return false;
//	}
//
//	return true;
//}
//
//int main() 
//{
//	std::string word;
//	std::cin >> word;
//
//	if (isConstant(word))
//		std::cout << "constant\n";
//
//	else if (isField(word))
//		std::cout << "field\n";
//
//	else if (isPascal(word))
//		std::cout << "pascal\n";
//
//	else if (isElephant(word))
//		std::cout << "elephant\n";
//
//	else
//		std::cout << "mismatch\n";
//
//	return 0;
//}