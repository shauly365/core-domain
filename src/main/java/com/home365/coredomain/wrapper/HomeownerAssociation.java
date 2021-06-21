package com.home365.coredomain.wrapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HomeownerAssociation implements Serializable {
    String whoPays;
    String hoaCompany;
    String hoaAccountNumber;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HomeownerAssociation that = (HomeownerAssociation) o;
        return
                hoaCompany.equalsIgnoreCase(that.getHoaCompany()) &&
                        hoaAccountNumber.equalsIgnoreCase(that.hoaAccountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hoaCompany, hoaAccountNumber);
    }
}

