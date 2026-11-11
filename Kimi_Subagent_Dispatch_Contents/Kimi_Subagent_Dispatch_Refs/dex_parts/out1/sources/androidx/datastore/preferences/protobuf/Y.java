package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import s3.AbstractC1983e;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes.dex */
public final class Y extends AbstractC0854b implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Y f12455d = new Y(0, false, new Object[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f12456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12457c;

    public Y(int i4, boolean z10, Object[] objArr) {
        this.f12462a = z10;
        this.f12456b = objArr;
        this.f12457c = i4;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e();
        int i4 = this.f12457c;
        Object[] objArr = this.f12456b;
        if (i4 == objArr.length) {
            this.f12456b = Arrays.copyOf(objArr, ((i4 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f12456b;
        int i9 = this.f12457c;
        this.f12457c = i9 + 1;
        objArr2[i9] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void f(int i4) {
        if (i4 < 0 || i4 >= this.f12457c) {
            StringBuilder sbI = AbstractC1983e.i(i4, "Index:", ", Size:");
            sbI.append(this.f12457c);
            throw new IndexOutOfBoundsException(sbI.toString());
        }
    }

    public final Y g(int i4) {
        if (i4 < this.f12457c) {
            throw new IllegalArgumentException();
        }
        return new Y(this.f12457c, true, Arrays.copyOf(this.f12456b, i4));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        f(i4);
        return this.f12456b[i4];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0854b, java.util.AbstractList, java.util.List
    public final Object remove(int i4) {
        e();
        f(i4);
        Object[] objArr = this.f12456b;
        Object obj = objArr[i4];
        if (i4 < this.f12457c - 1) {
            System.arraycopy(objArr, i4 + 1, objArr, i4, (r2 - i4) - 1);
        }
        this.f12457c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        e();
        f(i4);
        Object[] objArr = this.f12456b;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12457c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i9;
        e();
        if (i4 >= 0 && i4 <= (i9 = this.f12457c)) {
            Object[] objArr = this.f12456b;
            if (i9 < objArr.length) {
                System.arraycopy(objArr, i4, objArr, i4 + 1, i9 - i4);
            } else {
                Object[] objArr2 = new Object[((i9 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i4);
                System.arraycopy(this.f12456b, i4, objArr2, i4 + 1, this.f12457c - i4);
                this.f12456b = objArr2;
            }
            this.f12456b[i4] = obj;
            this.f12457c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbI = AbstractC1983e.i(i4, "Index:", ", Size:");
        sbI.append(this.f12457c);
        throw new IndexOutOfBoundsException(sbI.toString());
    }
}
