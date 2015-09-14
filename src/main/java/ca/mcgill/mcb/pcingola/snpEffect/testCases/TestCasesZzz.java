package ca.mcgill.mcb.pcingola.snpEffect.testCases;

import org.junit.Test;

import ca.mcgill.mcb.pcingola.interval.Variant;
import ca.mcgill.mcb.pcingola.snpEffect.testCases.unity.TestCasesBaseApply;
import ca.mcgill.mcb.pcingola.util.Gpr;

/**
 * Test case
 *
 * Transcript:
 *	1:0-999, strand: +, id:transcript1, Protein
 *			Exons:
 *			1:100-199 'exon1', rank: 1, frame: ., sequence: atgtccgcaggtgaaggcatacacgctgcgcgtatactgatgttacctcgatggattttgtcagaaatatggtgcccaggacgcgaagggcatattatgg
 *			1:300-399 'exon2', rank: 2, frame: ., sequence: tgtttgggaattcacgggcacggttctgcagcaagctgaattggcagctcggcataaatcccgaccccatcgtcacgcacggatcaattcatcctcaacg
 *			1:900-999 'exon3', rank: 0, frame: ., sequence: ggtagaggaaaagcacctaacccccattgagcaggatctctttcgtaatactctgtatcgattaccgatttatttgattccccacatttatttcatcggg
 *			CDS     :	atgtccgcaggtgaaggcatacacgctgcgcgtatactgatgttacctcgatggattttgtcagaaatatggtgcccaggacgcgaagggcatattatggtgtttgggaattcacgggcacggttctgcagcaagctgaattggcagctcggcataaatcccgaccccatcgtcacgcacggatcaattcatcctcaacgggtagaggaaaagcacctaacccccattgagcaggatctctttcgtaatactctgtatcgattaccgatttatttgattccccacatttatttcatcggg
 *			Protein :	MSAGEGIHAARILMLPRWILSEIWCPGREGHIMVFGNSRARFCSKLNWQLGINPDPIVTHGSIHPQRVEEKHLTPIEQDLFRNTLYRLPIYLIPHIYFIG
 *
 *
 * Transcript (full coordinates):
 * 0
 * 0                                                                                                   1                                                                                                   2                                                                                                   3                                                                                                   4                                                                                                   5                                                                                                   6                                                                                                   7                                                                                                   8                                                                                                   9
 * 0         1         2         3         4         5         6         7         8         9         0         1         2         3         4         5         6         7         8         9         0         1         2         3         4         5         6         7         8         9         0         1         2         3         4         5         6         7         8         9         0         1         2         3         4         5         6         7         8         9         0         1         2         3         4         5         6         7         8         9         0         1         2         3         4         5         6         7         8         9         0         1         2         3         4         5         6         7         8         9         0         1         2         3         4         5         6         7         8         9         0         1         2         3         4         5         6         7         8         9
 * 0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789
 * ....................................................................................................atgtccgcaggtgaaggcatacacgctgcgcgtatactgatgttacctcgatggattttgtcagaaatatggtgcccaggacgcgaagggcatattatgg....................................................................................................tgtttgggaattcacgggcacggttctgcagcaagctgaattggcagctcggcataaatcccgaccccatcgtcacgcacggatcaattcatcctcaacg....................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................ggtagaggaaaagcacctaacccccattgagcaggatctctttcgtaatactctgtatcgattaccgatttatttgattccccacatttatttcatcggg
 *                                                                                                      M  S  A  G  E  G  I  H  A  A  R  I  L  M  L  P  R  W  I  L  S  E  I  W  C  P  G  R  E  G  H  I  M                                                                                                      V  F  G  N  S  R  A  R  F  C  S  K  L  N  W  Q  L  G  I  N  P  D  P  I  V  T  H  G  S  I  H  P  Q                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      R  V  E  E  K  H  L  T  P  I  E  Q  D  L  F  R  N  T  L  Y  R  L  P  I  Y  L  I  P  H  I  Y  F  I  G
 *                                                                                                     0120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120                                                                                                    1201201201201201201201201201201201201201201201201201201201201201201201201201201201201201201201201201                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    2012012012012012012012012012012012012012012012012012012012012012012012012012012012012012012012012012
 * ---------------------------------------------------------------------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>---------------------------------------------------------------------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
 *                                                                                                    |                                                                                                  |                                                                                                    |                                                                                                  |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |                                                                                                  |
 *                                                                                                    |                                                                                                  |                                                                                                    |                                                                                                  |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |                                                                                                  |^999
 *                                                                                                    |                                                                                                  |                                                                                                    |                                                                                                  |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |^900
 *                                                                                                    |                                                                                                  |                                                                                                    |                                                                                                  |^399
 *                                                                                                    |                                                                                                  |                                                                                                    |^300
 *                                                                                                    |                                                                                                  |^199
 *                                                                                                    |^100
 */
public class TestCasesZzz extends TestCasesBaseApply {

	public TestCasesZzz() {
		super();
	}

	/**
	 * Variant before exon
	 */
	@Test
	public void test_apply_variant_01() {
		Gpr.debug("Test");

		Variant variant = new Variant(transcript.getParent(), 290, "", "ACG");
		checkApply(variant, transcript.cds(), transcript.protein(), 303, 402);
	}

	/**
	 * Variant before exon
	 */
	@Test
	public void test_apply_variant_02() {
		Gpr.debug("Test");

		Variant variant = new Variant(transcript.getParent(), 297, "", "ACG");
		checkApply(variant, transcript.cds(), transcript.protein(), 303, 402);
	}

	/**
	 * Variant overlapping exon start
	 */
	@Test
	public void test_apply_variant_03() {
		Gpr.debug("Test");

		Variant variant = new Variant(transcript.getParent(), 299, "", "ACG");
		checkApply(variant, transcript.cds(), transcript.protein(), 303, 402);
	}

	/**
	 * Variant at exon start
	 */
	@Test
	public void test_apply_variant_04() {
		Gpr.debug("Test");

		Variant variant = new Variant(transcript.getParent(), 300, "", "ACG");

		String expectedCds = "atgtccgcaggtgaaggcatacacgctgcgcgtatactgatgttacctcgatggattttgtcagaaatatggtgcccaggacgcgaagggcatattatgg" // Exon[0]
				+ "ACGtgtttgggaattcacgggcacggttctgcagcaagctgaattggcagctcggcataaatcccgaccccatcgtcacgcacggatcaattcatcctcaacg".toLowerCase() // Exon[1]
				+ "ggtagaggaaaagcacctaacccccattgagcaggatctctttcgtaatactctgtatcgattaccgatttatttgattccccacatttatttcatcggg" // Exon[2]
				;

		checkApply(variant, expectedCds, null, 300, 402);

	}

	/**
	 * Variant in exon
	 */
	@Test
	public void test_apply_variant_05() {
		Gpr.debug("Test");

		Variant variant = new Variant(transcript.getParent(), 310, "", "ACG");

		String expectedCds = "atgtccgcaggtgaaggcatacacgctgcgcgtatactgatgttacctcgatggattttgtcagaaatatggtgcccaggacgcgaagggcatattatgg" // Exon[0]
				+ "tgtttgggaaACGttcacgggcacggttctgcagcaagctgaattggcagctcggcataaatcccgaccccatcgtcacgcacggatcaattcatcctcaacg".toLowerCase() // Exon[1]
				+ "ggtagaggaaaagcacctaacccccattgagcaggatctctttcgtaatactctgtatcgattaccgatttatttgattccccacatttatttcatcggg" // Exon[2]
				;

		checkApply(variant, expectedCds, null, 300, 402);

	}

	/**
	 * Variant in exon
	 */
	@Test
	public void test_apply_variant_06() {
		Gpr.debug("Test");

		Variant variant = new Variant(transcript.getParent(), 399, "", "ACG");

		String expectedCds = "atgtccgcaggtgaaggcatacacgctgcgcgtatactgatgttacctcgatggattttgtcagaaatatggtgcccaggacgcgaagggcatattatgg" // Exon[0]
				+ "tgtttgggaattcacgggcacggttctgcagcaagctgaattggcagctcggcataaatcccgaccccatcgtcacgcacggatcaattcatcctcaacACGg".toLowerCase() // Exon[1]
				+ "ggtagaggaaaagcacctaacccccattgagcaggatctctttcgtaatactctgtatcgattaccgatttatttgattccccacatttatttcatcggg" // Exon[2]
				;

		checkApply(variant, expectedCds, null, 300, 402);

	}

	/**
	 * Variant overlapping exon end
	 */
	@Test
	public void test_apply_variant_07() {
		Gpr.debug("Test");

		Variant variant = new Variant(transcript.getParent(), 399, "", "ACG");

		String expectedCds = "atgtccgcaggtgaaggcatacacgctgcgcgtatactgatgttacctcgatggattttgtcagaaatatggtgcccaggacgcgaagggcatattatgg" // Exon[0]
				+ "tgtttgggaattcacgggcacggttctgcagcaagctgaattggcagctcggcataaatcccgaccccatcgtcacgcacggatcaattcatcctcaacACGg".toLowerCase() // Exon[1]
				+ "ggtagaggaaaagcacctaacccccattgagcaggatctctttcgtaatactctgtatcgattaccgatttatttgattccccacatttatttcatcggg" // Exon[2]
				;

		checkApply(variant, expectedCds, null, 300, 402);

	}

	/**
	 * Variant right after exon end
	 */
	@Test
	public void test_apply_variant_08() {
		Gpr.debug("Test");

		Variant variant = new Variant(transcript.getParent(), 400, "", "ACG");
		checkApply(variant, transcript.cds(), transcript.protein(), 300, 399);
	}

	/**
	 * Variant after exon end
	 */
	@Test
	public void test_apply_variant_09() {
		Gpr.debug("Test");

		Variant variant = new Variant(transcript.getParent(), 410, "", "ACG");
		checkApply(variant, transcript.cds(), transcript.protein(), 300, 399);
	}

	/**
	 * Variant over exon: variant is larger than exon, starts before exon and overlaps the whole exon
	 */
	@Test
	public void test_apply_variant_10() {
		Gpr.debug("Test");

		Variant variant = new Variant(transcript.getParent(), 290, "", "ATTGGCTCGACGCTCATTCACTCCAACAGCCCGGGACCCCCGCTCAATTATTTCACTCACCGGGAAAATTGTACCGATTGTCCGTGCCTTACTTCAAATGACATCCGCAGGTGAAGGCAT");
		checkApply(variant, transcript.cds(), transcript.protein(), 420, 519);
	}

	/**
	 * Variant over exon: variant is larger than exon and starts right at exons start and ends after exon end
	 */
	@Test
	public void test_apply_variant_11() {
		Gpr.debug("Test");

		String seq = "ATTGGCTCGACGCTCATTCACTCCAACAGCCCGGGACCCCCGCTCAATTATTTCACTCACCGGGAAAATTGTACCGATTGTCCGTGCCTTACTTCAAATGACATCCGCAGGTGAAGGCAT";
		Variant variant = new Variant(transcript.getParent(), 300, "", seq);

		String expectedCds = "atgtccgcaggtgaaggcatacacgctgcgcgtatactgatgttacctcgatggattttgtcagaaatatggtgcccaggacgcgaagggcatattatgg" // Exon[0]
				+ seq.toLowerCase() + "tgtttgggaattcacgggcacggttctgcagcaagctgaattggcagctcggcataaatcccgaccccatcgtcacgcacggatcaattcatcctcaacg" // Exon[1]
				+ "ggtagaggaaaagcacctaacccccattgagcaggatctctttcgtaatactctgtatcgattaccgatttatttgattccccacatttatttcatcggg" // Exon[2]
				;

		checkApply(variant, expectedCds, null, 300, 519);

	}

	/**
	 * Variant over exon: variant is larger than exon, starts before exon start and end right at exon end
	 */
	@Test
	public void test_apply_variant_12() {
		Gpr.debug("Test");

		String seq = "ATTGGCTCGACGCTCATTCACTCCAACAGCCCGGGACCCCCGCTCAATTATTTCACTCACCGGGAAAATTGTACCGATTGTCCGTGCCTTACTTCAAATGACATCCGCAG";
		Variant variant = new Variant(transcript.getParent(), 290, "", seq);

		checkApply(variant, transcript.cds(), transcript.protein(), 410, 509);

	}

	/**
	 * Variant over exon: variant is on the same coordiantes as exon
	 */
	@Test
	public void test_apply_variant_13() {
		Gpr.debug("Test");

		String seq = "ATTGGCTCGACGCTCATTCACTCCAACAGCCCGGGACCCCCGCTCAATTATTTCACTCACCGGGAAAATTGTACCGATTGTCCGTGCCTTACTTCAAATG";
		Variant variant = new Variant(transcript.getParent(), 300, "", seq);

		String expectedCds = "atgtccgcaggtgaaggcatacacgctgcgcgtatactgatgttacctcgatggattttgtcagaaatatggtgcccaggacgcgaagggcatattatgg" // Exon[0]
				+ seq.toLowerCase() + "tgtttgggaattcacgggcacggttctgcagcaagctgaattggcagctcggcataaatcccgaccccatcgtcacgcacggatcaattcatcctcaacg" // Exon[1]
				+ "ggtagaggaaaagcacctaacccccattgagcaggatctctttcgtaatactctgtatcgattaccgatttatttgattccccacatttatttcatcggg" // Exon[2]
				;

		checkApply(variant, expectedCds, null, 300, 499);
	}

}
