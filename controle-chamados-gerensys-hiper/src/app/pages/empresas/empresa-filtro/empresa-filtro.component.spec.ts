import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmpresaFiltroComponent } from './empresa-filtro.component';

describe('EmpresaFiltroComponent', () => {
  let component: EmpresaFiltroComponent;
  let fixture: ComponentFixture<EmpresaFiltroComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmpresaFiltroComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmpresaFiltroComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
