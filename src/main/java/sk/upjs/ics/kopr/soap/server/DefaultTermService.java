package sk.upjs.ics.kopr.soap.server;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DefaultTermService {
    private List<Term> terms = new ArrayList<Term>();

    public DefaultTermService() {
        terms.add(new Term(LocalDate.of(2020, 12, 12), "UINF/PAZ1c", 100));
        terms.add(new Term(LocalDate.of(2020, 12, 15), "UINF/PAZ1c", 75));
        terms.add(new Term(LocalDate.of(2021, 1, 5), "UINF/TVY1a", 50));
    }

    public List<Term> getTerms(String courseCode) {
        return terms.stream()
                .filter(term -> term.getCourseCode().equals(courseCode))
                .collect(Collectors.toList());
    }
}
