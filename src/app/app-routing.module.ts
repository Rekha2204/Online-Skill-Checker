import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { LoginComponent } from './login/login.component';
import { StudregComponent } from './studreg/studreg.component';
import { AdloginComponent } from './adlogin/adlogin.component';
import { AdsignupComponent } from './adsignup/adsignup.component';
import { ContactComponent } from './contact/contact.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [
  { path: '',component: HomeComponent},
  { path: 'about',component: AboutComponent},
  { path: 'studreg', component: StudregComponent },
  { path: 'login', component: LoginComponent },
  { path: 'adlogin', component: AdloginComponent },
  { path: 'adsignup', component: AdsignupComponent },
  { path: 'contact', component: ContactComponent }



]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
