public class Main {

    static int countGTC(String toCheck){
        int count = 0;
        for (int i = 0; i < toCheck.length()-2;i++){
            if (toCheck.charAt(i)=='G' && toCheck.charAt(i+1) == 'T' && toCheck.charAt(i+2)=='C') {
                count++;
            }
        }
        return count;
    }

    static void diagnosis(String toCheck){
        int count = countGTC(toCheck);
        if (countGTC(toCheck) > 10) {
            System.out.printf("sequence \"GTC\" appeared %d times; infection chance is high.\n", count);
        } else {
            System.out.printf("sequence \"GTC\" appeared %d times.\n", count);
        }
    }
    
    public static void main(String[] args) {

        String str1 = "ATCTGAAATGAACTGGTCTATGCGACAGAAACTGTGCAGCTACCTAATCTCCTTAGTGTAGGTTCTGACCGATTCGTGCTTCGTTGAGAACTCACAATTTAACAACAGAGGACATAAGCCCTACGCCCATGATCTACTGACGTCCCTGAGGCTGCAATTCATGTAATGGGACAGTATCCGCGGCAAGTCCTAGTGCAATGGCGGTATTCTACCCTCGTACTGTAGTAGAGGCGACGCGGGTGCGGTCATCACTAATAAGGATATTGGGAAGACTCACAGGCCTCCGCCTTTAGGCGGTGCTTACTCTTACATAAAGGGGCTGTTAGTATTACCCCGCGAGGATTCGAAAAGGTGAGCCAACCCGGCCGATCCGGAGAGACGGGCCTCAAAGCCGCGTGACGACGGCTGTGGGCCCGTAACAAAATCCCCGCAATAAGCTCCCGTGAGCGTCGGTTGAACAGCCCTGGTCGGCCCCATCAGTAGCCCGAATATGTCGCTTTACGGGTCCTGGGCCGGGGTGCGATACCTTGCAGAAATCGAGGCCGTTCGTTAATTCCTGTTGCATTCGTACCGCCTATATTTGTCTCTTTGCCGGCTTATATGGACAAGCATAGCATAGCCATTTATCGGAGCGCCTCCGTACACGGTATGATCGGACGCCTCGTGAGATCAATACGTATACCAGGTGTCCTGTGAGCAGCGAAAGCCTATACGCGAGATACACTGCCAAAAATCCGCGTGATTACGAGTCGTGGCAAATTTGGTCTGGCTGTGGTCTAGACATTCCAGGCGGTGCGTCTGCTCTCGGGTGCCTCTAGTGGCTGGCTAGATAGACTAGCCGCTGGTAAACACACCATGACCCCGGCTCTCCATTGATGCCACGGCGATTGTTGGAGAGCCAGCAGCGACTGCAAACATCAGATCAGAGTAATACTAGCATGCGATAAGTCCCTAACTGACTATGGCCTTCTGTAGAGTCAACTTCACCACATATGCTGTC";
        String str2 = "AACTGAAATGAACTGGTATATGCGACAGAAACTGTGCAGCTACCTAATCTCCTTAGTGTAGGTTCTGACCGATTCGTGCTTCGTTGAGAACTCACAATTTAACAACAGAGGACATAAGCCCTACGCCCATGATCTACTGACGTTCCTGAGGCTGCAATTCATGTAATGGGACAGTATCCGCGGCAATTCCTAGTGCAATGGCGGTATTCTACCCTCGTACTGTAGTAGAGGCGACGCGGGTGCGCTCATCACTAATAAGGATATTGGGAAGACTCACAGGCCTCCGCCTTTAGGCGGTGCTTACTCTTACATAAAGGGGCTGTTAGTATTACCCCGCGAGGATTCGAAAAGGTGAGCCAACCCGGCCGATCCGGAGAGACGGGCCTCAAAGCCGCGTGACGACGGCTGTGGGCCCGTAACAAAATCCCCGCAATAAGCTCCCGTGAGCCTCGGTTGAACAGCCCTGGTCGGCCCCATCAGTAGCCCGAATATGCCGCTTTACGGGTCCTGGGCCGGGGTGCGATACCTTGCAGAAATCGAGGCCGTTCGTTAATTCCTGTTGCATTCGTACCGCCTATATTTGTGTCTTTGCCGGCTTATATGGACAAGCATAGCATAGCCATTTATCGGAGCGCCTCCGTACACGGTATGATCGGACGCCTCGTGAGATCAATACGTATACCAGGTGTTCTGTGAGCAGCGAAAGCCTATACGCGAGATACACTGCCAAAAATCCGCGTGATTACGAGTCGTGGCAAATTTGGTCTGGCTGTGGTCTAGACATTCCAGGCGGTGCGTCTGCTCTCGGGTGCCTCTAGTGGCTGGCTAGATAGACTAGCCGCTGGTAAACACACCATGACCCCGGCTCTCCATTGATGCCACGGCGATTGTTGGAGAGCCAGCAGCGACTGCAAACATCAGATCAGAGTAATACTAGCATGCGATAAGTCCCTAACTGACTATGGCCTTCTGTAGAGTAAACTTCACCACATATGCTGTC";

        diagnosis(str1);
        diagnosis(str2);

    }


}
