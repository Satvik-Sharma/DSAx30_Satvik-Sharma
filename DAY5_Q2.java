class Solution {
    private String merge(String a, String b) {
        if (a.contains(b)) return a;
        int maxOverlap = 0;
        for (int i = 1; i <= Math.min(a.length(), b.length()); i++) {
            if (a.endsWith(b.substring(0, i))) {
                maxOverlap = i;
            }
        }
        return a + b.substring(maxOverlap);
    }

    public String minimumString(String a, String b, String c) {
        String[] arr = {a, b, c};
        String result = null;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == i) continue;
                for (int k = 0; k < 3; k++) {
                    if (k == i || k == j) continue;

                    String first = arr[i];
                    String second = arr[j];
                    String third = arr[k];

                    String merged1 = merge(first, second);
                    String merged2 = merge(merged1, third);

                    if (result == null ||
                        merged2.length() < result.length() ||
                        (merged2.length() == result.length() && merged2.compareTo(result) < 0)) {
                        result = merged2;
                    }
                }
            }
        }

        return result;
    }
}
