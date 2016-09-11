package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.vending.licensing.APKExpansionPolicy;

public class a implements Creator<AddEventListenerRequest> {
    static void a(AddEventListenerRequest addEventListenerRequest, Parcel parcel, int i) {
        int p = b.p(parcel);
        b.c(parcel, 1, addEventListenerRequest.wj);
        b.a(parcel, 2, addEventListenerRequest.CS, i, false);
        b.c(parcel, 3, addEventListenerRequest.Dm);
        b.D(parcel, p);
    }

    public AddEventListenerRequest C(Parcel parcel) {
        int i = 0;
        int o = com.google.android.gms.common.internal.safeparcel.a.o(parcel);
        DriveId driveId = null;
        int i2 = 0;
        while (parcel.dataPosition() < o) {
            DriveId driveId2;
            int g;
            int n = com.google.android.gms.common.internal.safeparcel.a.n(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.S(n)) {
                case APKExpansionPolicy.PATCH_FILE_URL_INDEX /*1*/:
                    int i3 = i;
                    driveId2 = driveId;
                    g = com.google.android.gms.common.internal.safeparcel.a.g(parcel, n);
                    n = i3;
                    break;
                case DetectedActivity.ON_FOOT /*2*/:
                    g = i2;
                    DriveId driveId3 = (DriveId) com.google.android.gms.common.internal.safeparcel.a.a(parcel, n, DriveId.CREATOR);
                    n = i;
                    driveId2 = driveId3;
                    break;
                case DetectedActivity.STILL /*3*/:
                    n = com.google.android.gms.common.internal.safeparcel.a.g(parcel, n);
                    driveId2 = driveId;
                    g = i2;
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, n);
                    n = i;
                    driveId2 = driveId;
                    g = i2;
                    break;
            }
            i2 = g;
            driveId = driveId2;
            i = n;
        }
        if (parcel.dataPosition() == o) {
            return new AddEventListenerRequest(i2, driveId, i);
        }
        throw new com.google.android.gms.common.internal.safeparcel.a.a("Overread allowed size end=" + o, parcel);
    }

    public AddEventListenerRequest[] ah(int i) {
        return new AddEventListenerRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return C(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return ah(x0);
    }
}
