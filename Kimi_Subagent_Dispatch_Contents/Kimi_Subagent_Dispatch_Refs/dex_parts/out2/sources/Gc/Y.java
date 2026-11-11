package Gc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
@fn.g
public final class Y {

    @NotNull
    public static final U Companion = new U();
    public static final Sk.l[] b = {Sk.m.a(Sk.n.b, new Ef.a(27))};
    public static final Y c = new Y();
    public final List a;

    public Y() {
        kotlin.collections.I i = kotlin.collections.I.a;
        Intrinsics.checkNotNullParameter(i, "itemConfigs");
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Y) && Intrinsics.b(this.a, ((Y) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return cn.jiguang.commons.a.A.k("FeatureConfig(itemConfigs=", this.a, ")");
    }

    public Y(int i, List list) {
        if ((i & 1) == 0) {
            this.a = kotlin.collections.I.a;
        } else {
            this.a = list;
        }
    }
}
