import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChamadosFiltroComponent } from './chamados-filtro.component';

describe('ChamadosFiltroComponent', () => {
  let component: ChamadosFiltroComponent;
  let fixture: ComponentFixture<ChamadosFiltroComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChamadosFiltroComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChamadosFiltroComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
