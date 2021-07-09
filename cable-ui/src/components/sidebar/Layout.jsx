import React from "react";

import { NavSidebar } from "./NavSidebar";
import BodyWrapper from "./BodyWrapper";

export const DashboardLayout = ({ children }) => {
    return (
        <BodyWrapper>
            <div className="flex h-screen ">
                <NavSidebar />

                <div className="flex flex-col flex-1">
                    <main className="content">
                        <section className="sm:flex-row flex flex-col flex-1">
                            <div
                                className="content-box"
                                style={{ flexGrow: 2, flexBasis: "0%" }}
                            >
                                {children}
                            </div>
                        </section>
                    </main>
                </div>
            </div>
        </BodyWrapper>
    );
};
